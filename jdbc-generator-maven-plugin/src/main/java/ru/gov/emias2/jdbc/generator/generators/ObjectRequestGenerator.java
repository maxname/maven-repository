package ru.gov.emias2.jdbc.generator.generators;

import ru.gov.emias2.jdbc.generator.helper.JavaBuilder;
import ru.gov.emias2.jdbc.generator.jaxb.RequestModel;

/**
 * @author mkomlev
 */
public class ObjectRequestGenerator extends AbstractGenerator {

    @Override
    protected void generate(RequestModel model, JavaBuilder b, String className) {
        putClassSignature(model, b, "ru.gov.emias2.jdbc.ObjectRequest", className,
                model.getResponse().getObject().getResultClass());
        putConstructor(model, b, className);
        putMapper(model, b, model.getResponse().getObject());
        putParametersMethod(model, b);
        putResultClassMethod(model, b, model.getResponse().getObject().getResultClass());
        putQueryMethod(model, b);
        putParametersGettersAndSetters(model, b);
        b.put("}");
    }

}
