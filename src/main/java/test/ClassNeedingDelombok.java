package test;
import lombok.Getter;
import lombok.Setter;
/**
 * Class needing delombok
 */
public class ClassNeedingDelombok {
  /**
   * @param Field value
   * @return Field value
   */
  @Getter
  @Setter
  private String field = "value";
}
