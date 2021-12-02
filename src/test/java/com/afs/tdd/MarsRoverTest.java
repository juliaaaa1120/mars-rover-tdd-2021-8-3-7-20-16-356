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

    @Test
    public void should_locationY_minus_one_space_when_execute_command_given_direction_S_and_command_M() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "M";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 -1 S", result);
    }

    @Test
    public void should_locationX_add_one_space_when_execute_command_given_direction_E_and_command_M() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "M";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("1 0 E", result);
    }

    @Test
    public void should_locationX_minus_one_space_when_execute_command_given_direction_W_and_command_M() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String command = "M";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("-1 0 W", result);
    }

    @Test
    public void should_direction_return_W_when_execute_command_given_direction_N_and_command_L() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "L";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 W", result);
    }

    @Test
    public void should_direction_return_E_when_execute_command_given_direction_S_and_command_L() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "L";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 E", result);
    }

    @Test
    public void should_direction_return_N_when_execute_command_given_direction_E_and_command_L() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "L";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 N", result);
    }

    @Test
    public void should_direction_return_S_when_execute_command_given_direction_W_and_command_L() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String command = "L";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 S", result);
    }

    @Test
    public void should_direction_return_E_when_execute_command_given_direction_N_and_command_R() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "R";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 E", result);
    }

    @Test
    public void should_direction_return_W_when_execute_command_given_direction_S_and_command_R() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "R";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 W", result);
    }

    @Test
    public void should_direction_return_S_when_execute_command_given_direction_E_and_command_R() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "R";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 S", result);
    }

    @Test
    public void should_direction_return_N_when_execute_command_given_direction_W_and_command_R() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String command = "R";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 N", result);
    }

    @Test
    public void should_return_correct_result_when_execute_command_given_direction_and_multiple_commands() throws Exception {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "MLMR";

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //then
        assertEquals("-1 1 N", result);
    }
}
