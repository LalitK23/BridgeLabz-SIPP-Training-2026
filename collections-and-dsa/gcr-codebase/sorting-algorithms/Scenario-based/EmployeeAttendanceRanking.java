import java.util.*;

public class EmployeeAttendanceRanking {

    public static void main(String[] args) {

        int employeeIds[] = {101, 102, 103, 104, 105};
        int attendance[] = {92, 85, 98, 92, 80};

        int k = 3;

        for (int i = 0; i < attendance.length - 1; i++) {

            int max = i;

            for (int j = i + 1; j < attendance.length; j++) {

                if (attendance[j] > attendance[max]) {

                    max = j;

                } else if (attendance[j] == attendance[max] &&
                           employeeIds[j] < employeeIds[max]) {

                    max = j;
                }
            }

            int tempAttendance = attendance[i];
            attendance[i] = attendance[max];
            attendance[max] = tempAttendance;

            int tempId = employeeIds[i];
            employeeIds[i] = employeeIds[max];
            employeeIds[max] = tempId;
        }

        System.out.println("Top " + k + " Employees:");

        for (int i = 0; i < k; i++) {
            System.out.print(employeeIds[i] + " ");
        }
    }
}