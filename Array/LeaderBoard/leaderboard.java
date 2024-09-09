package LeaderBoard;

public class leaderboard {
    private int num_student = 0;
    student Leader_Board[];

    public leaderboard(int studentNumber) {
        Leader_Board = new student[studentNumber];
    }

    public void Add(student s) {
        Leader_Board[num_student] = s;
        num_student++;
    }

    public void sort() {
        for(int i=0; i<num_student; i++) {
            student tempStudent = Leader_Board[i];
            double newCgpa = Leader_Board[i].getCgpa();

            int j = i-1;
            while((j >= 0) && (newCgpa > Leader_Board[j].getCgpa())) {
                Leader_Board[j+1] = Leader_Board[j];
                j--;
            }

            Leader_Board[j+1] = tempStudent;
        }
    }

    public void print() {
        sort();

        for(int i=0; i<num_student; i++) {
            System.out.println(Leader_Board[i]);
        }
    }
}
