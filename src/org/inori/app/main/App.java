package org.inori.app.main;

import org.inori.app.Model.EvnModel;
import org.inori.app.Model.Station;
import org.inori.app.Model.UPS;
import org.inori.app.Model.UPSParam;
import org.inori.app.XmlFieldName;
import org.inori.app.util.XmlUtils;

import javax.xml.bind.JAXBException;
import java.beans.PropertyDescriptor;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class App {

    public static void main(String[] args) {
        createNewXml();

        try {
            Station station = XmlUtils.getBean(new File("UPS.xml"), Station.class);
            System.out.println(station.toString());

            Map<String, List<EvnModel>> upsMap = new LinkedHashMap<String, List<EvnModel>>();
            if (station != null) {
                UPS ups = station.getUsp();
                Field[] fields = ups.getClass().getDeclaredFields();
                for (Field field : fields) {
                    PropertyDescriptor pd = new PropertyDescriptor(field.getName(), ups.getClass());
                    Method readMethod = pd.getReadMethod();
                    upsMap.put(field.getName(), (List<EvnModel>) readMethod.invoke(ups));
                }
            }
            System.out.println(upsMap);

            List<EvnModel> evnModelList = new LinkedList<EvnModel>();
            for (List<EvnModel> value : upsMap.values()) {
                evnModelList.addAll(value);
            }
            int upsNum = evnModelList.size() / 8;

            List<UPSParam> upsList = new LinkedList<UPSParam>();

            int index = 0;
            while (index < upsNum) {
                UPSParam upsParam = new UPSParam();
                Field[] fields = upsParam.getClass().getDeclaredFields();
                for (Field field : fields) {
                    if (field.isAnnotationPresent(XmlFieldName.class)) {
                        XmlFieldName annotation = field.getAnnotation(XmlFieldName.class);
                        String xmlFieldName = annotation.value();

                        for (Map.Entry<String, List<EvnModel>> entry : upsMap.entrySet()) {
                            if (entry.getKey().equals(xmlFieldName)) {
                                List<EvnModel> value = entry.getValue();

                                EvnModel evnModel = value.get(index);
                                String upsValue = evnModel.getValue() + evnModel.getUnit();

                                PropertyDescriptor pd = new PropertyDescriptor(field.getName(), upsParam.getClass());
                                Method writeMethod = pd.getWriteMethod();
                                writeMethod.invoke(upsParam, upsValue);

                                break;
                            }
                        }
                    }
                }

                upsList.add(upsParam);
                index ++;
            }

            System.out.println(upsList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createNewXml() {
        Station station = new Station();
        UPS ups = new UPS();

        List<EvnModel> outputVoltage = new LinkedList<EvnModel>();
        EvnModel evnModel = new EvnModel();
        evnModel.setName("UPS输出电压1");
        evnModel.setIp("1.2.3.4");
        evnModel.setCh("0");
        evnModel.setValue("23.23");
        evnModel.setUnit("V");
        outputVoltage.add(evnModel);

        EvnModel evnModel1 = new EvnModel();
        evnModel1.setName("UPS输出电压2");
        evnModel1.setIp("1.2.3.5");
        evnModel1.setCh("0");
        evnModel1.setValue("50.12");
        evnModel1.setUnit("V");
        outputVoltage.add(evnModel1);
        ups.setUpsOutputVoltage(outputVoltage);

        List<EvnModel> outputCurrent = new LinkedList<EvnModel>();
        EvnModel evnModel2 = new EvnModel();
        evnModel2.setName("UPS输出电流1");
        evnModel2.setIp("1.2.3.4");
        evnModel2.setCh("0");
        evnModel2.setValue("3.32");
        evnModel2.setUnit("A");
        outputCurrent.add(evnModel2);

        EvnModel evnModel3 = new EvnModel();
        evnModel3.setName("UPS输出电流2");
        evnModel3.setIp("1.2.3.5");
        evnModel3.setCh("0");
        evnModel3.setValue("13.32");
        evnModel3.setUnit("A");
        outputCurrent.add(evnModel3);
        ups.setUpsOutputCurrent(outputCurrent);

        List<EvnModel> outputLoadFactor = new LinkedList<EvnModel>();
        EvnModel evnModel4 = new EvnModel();
        evnModel4.setName("UPS负载功率1");
        evnModel4.setIp("1.2.3.4");
        evnModel4.setCh("0");
        evnModel4.setValue("55");
        evnModel4.setUnit("%");
        outputLoadFactor.add(evnModel4);

        EvnModel evnModel5 = new EvnModel();
        evnModel5.setName("UPS负载功率2");
        evnModel5.setIp("1.2.3.5");
        evnModel5.setCh("0");
        evnModel5.setValue("65");
        evnModel5.setUnit("%");
        outputLoadFactor.add(evnModel5);
        ups.setUpsOutputLoadFactor(outputLoadFactor);

        List<EvnModel> outputActivePower = new LinkedList<EvnModel>();
        EvnModel evnModel6 = new EvnModel();
        evnModel6.setName("UPS有功功率1");
        evnModel6.setIp("1.2.3.4");
        evnModel6.setCh("0");
        evnModel6.setValue("3358");
        evnModel6.setUnit("W");
        outputActivePower.add(evnModel6);

        EvnModel evnModel7 = new EvnModel();
        evnModel7.setName("UPS有功功率2");
        evnModel7.setIp("1.2.3.5");
        evnModel7.setCh("0");
        evnModel7.setValue("500");
        evnModel7.setUnit("W");
        outputActivePower.add(evnModel7);
        ups.setUpsOutputActivePower(outputActivePower);

        List<EvnModel> outputBatteryState = new LinkedList<EvnModel>();
        EvnModel evnModel8 = new EvnModel();
        evnModel8.setName("UPS电池状态1");
        evnModel8.setIp("1.2.3.4");
        evnModel8.setCh("0");
        evnModel8.setValue("良好");
        evnModel8.setUnit("");
        outputBatteryState.add(evnModel8);

        EvnModel evnModel9 = new EvnModel();
        evnModel9.setName("UPS电池状态2");
        evnModel9.setIp("1.2.3.5");
        evnModel9.setCh("0");
        evnModel9.setValue("优秀");
        evnModel9.setUnit("");
        outputBatteryState.add(evnModel9);
        ups.setUpsBatteryState(outputBatteryState);

        List<EvnModel> outputWorkingState = new LinkedList<EvnModel>();
        EvnModel evnModel10 = new EvnModel();
        evnModel10.setName("UPS工作状态1");
        evnModel10.setIp("1.2.3.4");
        evnModel10.setCh("0");
        evnModel10.setValue("交流");
        evnModel10.setUnit("");
        outputWorkingState.add(evnModel10);

        EvnModel evnModel11 = new EvnModel();
        evnModel11.setName("UPS工作状态2");
        evnModel11.setIp("1.2.3.5");
        evnModel11.setCh("0");
        evnModel11.setValue("直流");
        evnModel11.setUnit("");
        outputWorkingState.add(evnModel11);
        ups.setUpsWorkingState(outputWorkingState);

        List<EvnModel> inputVoltage = new LinkedList<EvnModel>();
        EvnModel evnModel12 = new EvnModel();
        evnModel12.setName("UPS输入电压1");
        evnModel12.setIp("1.2.3.4");
        evnModel12.setCh("0");
        evnModel12.setValue("380");
        evnModel12.setUnit("V");
        inputVoltage.add(evnModel12);

        EvnModel evnModel13 = new EvnModel();
        evnModel13.setName("UPS输入电压2");
        evnModel13.setIp("1.2.3.5");
        evnModel13.setCh("0");
        evnModel13.setValue("220");
        evnModel13.setUnit("V");
        inputVoltage.add(evnModel13);
        ups.setUpsInputVoltage(inputVoltage);

        List<EvnModel> inputCurrent = new LinkedList<EvnModel>();
        EvnModel evnModel14 = new EvnModel();
        evnModel14.setName("UPS输入电流1");
        evnModel14.setIp("1.2.3.4");
        evnModel14.setCh("0");
        evnModel14.setValue("5.51");
        evnModel14.setUnit("A");
        inputCurrent.add(evnModel14);

        EvnModel evnModel15 = new EvnModel();
        evnModel15.setName("UPS输入电流2");
        evnModel15.setIp("1.2.3.5");
        evnModel15.setCh("0");
        evnModel15.setValue("13.32");
        evnModel15.setUnit("A");
        inputCurrent.add(evnModel15);
        ups.setUpsInputCurrent(inputCurrent);

        station.setUsp(ups);

        try {
            XmlUtils.toFile(new File("UPS.xml"), station);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
