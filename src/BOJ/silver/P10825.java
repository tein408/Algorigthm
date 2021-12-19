package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P10825 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());

        Student[] students = new Student[n];

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");

            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());

            students[i] = new Student(name, korean, math, english);
        }

        Arrays.sort(students);
        for(Student s : students) {
            sb.append(s.name).append("\n");
        }
        System.out.println(sb);

    }
}

class Student implements Comparable<Student> {
    String name;
    int korean, english, math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {
        if(this.korean != student.korean) {
            if(this.korean > student.korean)
                return -1;
            else
                return 1;
        }
        if(this.english != student.english) {
            if(this.english < student.english)
                return -1;
            else
                return 1;
        }
        if(this.math != student.math) {
            if(this.math > student.math)
                return -1;
            else
                return 1;
        }
        return this.name.compareTo(student.name);
    }
}
