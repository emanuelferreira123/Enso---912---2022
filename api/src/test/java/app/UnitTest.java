package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
  @Test
  public void welcome() {
    Controller controller = new Controller();
    assertEquals("Bem-vindo(a) a calculadora API || Atualmente recebendo comandos...", controller.sayHi());
  }
}
