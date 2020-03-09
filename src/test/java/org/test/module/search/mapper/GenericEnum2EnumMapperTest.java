package org.test.module.search.mapper;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test.module.search.model.InputEnumValues;
import org.test.module.search.model.OutputEnumValues;

import java.util.function.Function;

class GenericEnum2EnumMapperTest {

    @Test
    public void testMapper() {
        //Given
        Function<Enum<?>, String> inputFunction = t -> ((InputEnumValues) t).getLabel();
        Function<Enum<?>, String> outputFunction = t -> ((OutputEnumValues) t).getLabel();

        //When
        OutputEnumValues result = (OutputEnumValues) GenericEnum2EnumMapper.map(InputEnumValues.ONE, inputFunction, OutputEnumValues.class, outputFunction);

        //Then
        Assertions.assertThat(result).isEqualTo(OutputEnumValues.UNO);
        Assertions.assertThat(result.getLabel()).isEqualTo(OutputEnumValues.UNO.getLabel());
    }

}