package dev.mttw.students.service;

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
}
