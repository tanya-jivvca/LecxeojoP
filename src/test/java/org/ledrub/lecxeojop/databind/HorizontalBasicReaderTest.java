package org.ledrub.lecxeojop.databind;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class HorizontalBasicReaderTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void shouldInstantiateObject() {
        // given
        File file = new File("horizontal-text-list-by-coordinates-no-stop-tag.xlsx");

        // when
        TextCells textCells = objectMapper.readAggregateRoot(file, TextCells.class);

        // then
        assertThat(textCells).isNotNull();
    }
}
