package dev.mttw.students.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentDTO {

  private String username;

  @JsonFormat(pattern = "dd.MM.yyyy")
  private LocalDate birthDate;
}
