package test;
import lombok.Getter;
import lombok.Setter;
/**
 * Class needing delombok with LF
 */
public class ClassNeedingDelombokLF {
  /**
   * @param Field value
   * @return Field value
   */
  @Getter
  @Setter
  private String field = "value";
}
