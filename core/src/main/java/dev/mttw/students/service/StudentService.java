package dev.mttw.students.service;

import dev.mttw.students.dto.CreateStudentDTO;
import dev.mttw.students.entity.Student;
import dev.mttw.students.repository.StudentRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public boolean doesStudentExist(long id) {
        return this.getStudentRepository().existsById(id);
    }

    public int addition(String numberOne, String numberTwo) {
        int nOneInt = Integer.parseInt(numberOne);
        int nTwoInt = Integer.parseInt(numberTwo);

        return nOneInt + nTwoInt;
    }

    public long createStudent(CreateStudentDTO dto) {
        Student student = this.mapToStudent(dto);
        this.getStudentRepository().save(student);
        return 1;
    }

    private Student mapToStudent(CreateStudentDTO dto) {
        return Student.builder()
            .username(dto.getUsername())
            .birthDate(dto.getBirthDate())
            .build();
    }
}
