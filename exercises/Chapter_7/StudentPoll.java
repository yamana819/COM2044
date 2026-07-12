package exercises.Chapter_7;

public class StudentPoll {
    public static void main(String[] args) {
        int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        int[] frequency = new int[6];
        for (int i=0;i<responses.length;i++){
            try {
                frequency[responses[i]]++;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Index:"+i+" Value:"+responses[i]);
            }
        }
        for (int i=1;i<frequency.length;i++){
            System.out.println("Rating:"+i+" Frequency:"+frequency[i]);
        }
    }
}
