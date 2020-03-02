package practice;

import java.util.*;

public class Test02 implements Runnable{

    public static int solution () {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i <= 1000; i++) {
            if(i%3 == 0) sum1 +=i;
            if(i%5 == 0) sum2 +=i;
        }
        return sum1 + sum2;
    }

    public static void solution2(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print(j);
            }
            System.out.print(i);
            System.out.println();
        }
    }

    public static void patternPrint(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }

    public static void solution3(int n) {
        for(int i=n; i>0; i--) {
            for(int j=n; j>i; j--) {
                System.out.print(j);
            }
            System.out.print(i);
            System.out.println();
        }
    }

    public static void solution4(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<i; j++){
                System.out.print(j);
            }
            System.out.print(i);
            System.out.println();
        }
    }

    public static void solution5(String a) {
        String[] stringArrayBySplit = a.split(" ");
        for(int i=0; i<stringArrayBySplit.length; i++) {
            StringBuilder sb = new StringBuilder(stringArrayBySplit[i]);
            System.out.print(sb.reverse() + " ");
        }
    }

    public static void solution6() {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i<=1000; i++) {
            if(i%3 == 0) sum1 += i;
            if(i%5 == 0) sum2 += i;
        }
        System.out.println(sum1 + sum2);
    }

    // 3의 배수와 5의 배수의 배수들 중 가장 큰 수들을 리턴
    public static void solution7() {
        int max1 = 0;
        int max2 = 0;
        for(int i=1; i<=889; i++) {
            if(i%3 == 0) max1 = (i > max1) ? i : max1;
            if(i%5 == 0) max2 = (i > max2) ? i : max2;
        }
        System.out.println(max1 + " : " +max2);
    }

    public static void solution8 () {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String [] arrayOfA = a.split("");

        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<arrayOfA.length; i++) {
            if(i==0) stringBuilder = stringBuilder.append(arrayOfA[i]);
            if(stringBuilder.toString().equals(arrayOfA[i])) {
                count ++;
                if(i==arrayOfA.length -1) {
                    System.out.print(stringBuilder.toString());
                    stringBuilder.delete(0,1);
                    System.out.print(count);
                }
            } else {
                System.out.print(stringBuilder.toString());
                stringBuilder.delete(0, 1);
                stringBuilder.append(arrayOfA[i]);
                System.out.print(count);
                count = 1;
            }

        }
    }

    public static void solution9 () {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int pivot = 0;
        for(int i=0; i<array.length; i++) {
            if(Integer.parseInt(array[i]) % 4 == 0) {
                pivot = pivot < Integer.parseInt(array[i]) ? Integer.parseInt(array[i]) : pivot;
            }
        }
        System.out.println(pivot);
    }

    public static void linkedHashMapTest () {
        Scanner sc = new Scanner(System.in);
        String [] array = sc.nextLine().split("");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        int size = 0;
        for(int i=0; i<array.length; i++) {
            if(linkedHashMap.size() == 0) {
                linkedHashMap.put(size,array[i]);
                size++;
            } else {
                boolean flag = true;
                for(int j=0; j<size; j++) {
                    if(linkedHashMap.get(j).equals(array[i])) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    linkedHashMap.put(size, array[i]);
                    size++;
                }
            }
        }


        for(int k=0; k<linkedHashMap.size(); k++) {
            System.out.print(linkedHashMap.get(k));
        }
        System.out.println(size);
    }

    public static void minDistance () {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split("");
        ArrayList<Integer> aIndex = new ArrayList<Integer>();
        ArrayList<Integer> bIndex = new ArrayList<Integer>();
        int min = 0;

        for(int i=0; i<array.length; i++) {
            if("A".equals(array[i])) aIndex.add(i);
            if("C".equals(array[i])) bIndex.add(i);
        }

        for(int j=0; j<aIndex.size(); j++) {
            for (int k=0; k<bIndex.size(); k++) {
                if(j==0 && k==0) {
                    int temp = bIndex.get(k) - aIndex.get(j);
                    if(temp < 0) temp *= -1;
                    min = temp;
                }
                if (bIndex.get(k) - aIndex.get(j) < 0) {
                    int temp = (bIndex.get(k) - aIndex.get(j)) * -1;
                    if(temp < min) min = temp;
                }
            }
        }
        System.out.println(min);
 }


 public static boolean randomeCheck() {
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i=0; i<10; i++) {
            int random = (int)(Math.random()*10) +1;
            if(array.size() == 0){
                array.add(random);
            } else {
                for(int j=0; j<array.size(); j++) {
                    if(array.get(j) == random) {
                        return false;
                    }
                }
                array.add(random);
            }
        }
        return true;
 }

 public static void test () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n; i>=1; i--) {
            for(int j=1; j<i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }
 }

 public static void test2() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print(j);
            }
            System.out.println(i);
        }
 }

 public static String test3() {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        String text = input.toString();
        String reverseTest = input.reverse().toString();
        StringBuilder answer = new StringBuilder();

        for(int i=text.length(); i>1; i--) {
            for(int j=0; j<=text.length()-i; j++) {
                if (reverseTest.contains(text.substring(j,j+i))) {
                    answer.append(text.substring(j,j+i));
                    return answer.toString();
                }
            }
        }
        return answer.toString();
 }


 // 펠린드롬 문제

 public static int palidrome () {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(sc.nextLine());
        String text = stringBuilder.toString();
        String reverseText = stringBuilder.reverse().toString();
        int answer = 0;

        for(int i=text.length(); i>1; i--) {
            for(int j=0; j<text.length()-i; j++) {
                if(reverseText.contains(text.substring(j, i+j))) {
                    answer = i;
                    return answer;
                }
            }
        }
        return answer;
 }

 public static void  tt () {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split("");
        StringBuilder answer = new StringBuilder();
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(i == 0){
                answer.append(array[i]);
                count++;
            } else {
                if(answer.substring(answer.length()-1,answer.length()).equals(array[i])) {
                    count ++;
                    if(i == array.length -1) {
                        answer.append(count);
                    }
                } else {
                    if(i == array.length -1) {
                        answer.append(count + array[i]);
                        count = 1;
                        answer.append(count);
                    } else {
                        answer.append(count + array[i]);
                        count = 1;
                    }
                }
            }
        }
     System.out.println(answer.toString());
 }

// 재귀 factorial
 public static int factorial (int n) {
        if(n <= 1) return 1;
        return (n)*factorial(n-1);
 }
// 반복 factorial
 public static int factorial2 (int n) {
        int sum = 1;
        for(int i = n; i>0; i--) {
            sum *= i;
        }
        return sum;
 }

    public static int Fibonacci(int n) {
        // 재귀함수 활용
        if(n <= 1)
            return 1;
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void linkedHashMap () {
        String input = "ccbbdddbcccaabbaaeeefff";
        // cbdaef
        String [] array = input.split("");
        LinkedHashMap<String, String> answer = new LinkedHashMap<String, String>();

        // 순서를 보장하고 중복을 허용하지 않는 자료구조
        // key : value 형태
        // 중복된 키의 값을 또 put하면 순서는 바뀌지 않고 value가 update됨

        for(int i=0; i<array.length; i++) {
            if(i == 0) {
                answer.put(array[i], array[i]);
            } else {
                if(answer.get(array[i]) == null) {
                    answer.put(array[i], array[i]);
                }
            }
        }

        answer.forEach( (key, value) -> {
            System.out.print(value + " ");
        });
    }
/*
abcdefg 라는 문자열이 주어졌고, n = 4 라고 할때
a c e g

b d f

이런식으로 결과가 나오게 하시오.
 */
    public static void misoft() {
        int n = 3;
        String input = "abcdefg";
        String[] array = input.split("");
        StringBuilder answer = new StringBuilder();
        StringBuilder answer2 = new StringBuilder();
        for(int i=0; i<array.length; i+=2) {
            answer.append(array[i] + " ");
        }
        for(int j=1; j<array.length; j+=2) {
            answer2.append(array[j] + " ");
        }

        System.out.println(answer.toString());
        System.out.println(answer2.toString());
    }

//ABCDEFGADD
    public static void main (String [] args) {
//        Test02 threadEx01 = new Test02();
//        Test02 threadEx02 = new Test02();
//        Test02 threadEx03 =  new Test02();
//        Thread thread1 = new Thread(threadEx01, "A");
//        Thread thread2 = new Thread(threadEx02, "B");
//        Thread thread3 = new Thread(threadEx03, "C");
//        thread1.setPriority(10);
//        thread2.setPriority(5);
//        thread3.setPriority(1);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        System.out.println(factorial2(5));
//        System.out.println(Fibonacci(5));

    }

    public static void hi () {

        test();
    }
    @Override
    public void run() {

            try {
                hi();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
