package org.test.module.search.mapper;

import java.util.Arrays;
import java.util.function.Function;

public class GenericEnum2EnumMapper {

    public static Object map(Enum<?> inEnumValue,
                             Function<Enum<?>, String> inputFunction,
                             Class<? extends Enum<?>> outputEnumType,
                             Function<Enum<?>, String> outputFunction) {

        Object inputLabel = inputFunction.apply(inEnumValue);

        return Arrays.asList(outputEnumType.getEnumConstants())
                .parallelStream()
                .filter(e -> inputLabel.equals(outputFunction.apply(e)))
                .findFirst()
                .orElse(null);
    }

}