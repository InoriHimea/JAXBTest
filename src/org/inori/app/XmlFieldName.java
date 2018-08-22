package org.inori.app;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface XmlFieldName {

    String value();
}
