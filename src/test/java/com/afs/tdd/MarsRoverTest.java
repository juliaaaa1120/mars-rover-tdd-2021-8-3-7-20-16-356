package com.afs.tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_locationY_add_one_space_when_execute_command_given_direction_N_and_command_M() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "M";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 1 N", result);
    }
}
