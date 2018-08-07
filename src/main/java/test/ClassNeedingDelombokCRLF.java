package test;
import lombok.Getter;
import lombok.Setter;
/**
 * Class needing delombok with CRLF
 */
public class ClassNeedingDelombokCRLF {
  /**
   * @param Field value
   * @return Field value
   */
  @Getter
  @Setter
  private String field = "value";
}
