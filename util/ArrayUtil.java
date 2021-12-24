package util;

import struct.Student;
import struct.Staff;
import struct.Board;
import struct.Employee;

// 배열을 사용하는데 도움이 되는 다양한 메소드를 모아둔 클래스
public class ArrayUtil {
    // 1. int[]
    // A. 현재 배열의 크기가 얼마인지 알려주는 size()
    public static int size(int[] arr) {
        return arr.length;
    }

    // B. 현재 배열의 특정 인덱스에 저장된 값을 리턴해주는
    // get()
    public static int get(int[] arr, int index) {
        return arr[index];
    }

    // C. 현재 배열이 비어있는지 아닌지를 알려주는
    // isEmpty()
    public static boolean isEmpty(int[] arr) {
        return size(arr) == 0;
    }

    // D. 현재 배열에 특정 값이 존재하는지 리턴해주는
    // contains()
    public static boolean contains(int[] arr, int e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i) == e) {
                return true;
            }
        }
        return false;
    }

    // E. 현재 배열에 특정 값이 가장 먼저 등장하는 인덱스가 얼마인지 리턴해주는
    // indexOf()
    // 단, 해당 배열에 그 특정값이 존재하지 않을 시에는 -1이 리턴된다.
    public static int indexOf(int[] arr, int e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i) == e) {
                return i;
            }
        }
        return -1;
    }

    // F. 현재 배열에 특정 값의 가장 마지막에 등장하는 인덱스가 얼마인지 리턴에주는
    // lastIndexOf()
    // 단, 해당 배열에 그 특정 값이 존재하지 않을 시에는 -1이 리턴된다.
    public static int lastIndexOf(int[] arr, int e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i) == e) {
                return i;
            }
        }
        return -1;
    }

    // G. 현재 배열에 맨 마지막 칸 뒤에 새로운 요소가 추가되어
    // 크기가 1 늘어난 배열을 리턴해주는
    // add()
    public static int[] add(int[] arr, int e) {
        int[] temp = new int[size(arr) + 1];
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }
        temp[size(temp) - 1] = e;

        return temp;
    }

    // H. 현재 배열에 특정 인덱스에 새로운 값을 추가하고
    // 기존에 있던 값들은 한칸씩 뒤로 밀려난
    // 배열을 리턴해주는 add()
    public static int[] add(int[] arr, int index, int e) {
        int[] temp = new int[0];
        for (int i = 0; i < index; i++) {
            temp = add(temp, get(arr, i));
        }
        temp = add(temp, e);
        for (int i = index; i < size(arr); i++) {
            temp = add(temp, get(arr, i));
        }
        return temp;
    }

    // I. 특정 인덱스의 값을 다른 값으로 교체하고
    // 기존 값을 리턴해서 필요하다면 추가적으로 처리를 할 수 있게하는
    // set()
    public static int set(int[] arr, int index, int e) {
        int temp = get(arr, index);
        arr[index] = e;

        return temp;
    }

    // J. 특정 인덱스를 삭제하는
    // removeByIndex()
    // 단, 유효하지 않은 인덱스가 넘어올 경우, 아무것도 삭제되지 않은
    // 원래 배열이 리턴된다.
    public static int[] removeByIndex(int[] arr, int index) {
        if (!(index >= 0 && index < size(arr))) {
            return arr;
        }
        int[] temp = new int[0];
//        for(int i=0;i<index;i++) {
//            temp=add(temp,get(arr,i));
//            
//        }
//        for(int i=index+1;i<size(arr);i++) {
//            temp=add(temp,get(arr,i));
//        }
        for (int i = 0; i < size(arr); i++) {
            if (i != index) {
                temp = add(temp, get(arr, i));

            }
        }
        return temp;
    }

    // K. 파라미터로 들어온 값을 배열에서 삭제하는
    // removeByElement()
    public static int[] removeByElement(int[] arr, int e) {
        // int index = indexOf(arr,e);
        // return removeByIndex(arr,index);
        // 굳이?

        // int[] temp=removeByIndex(arr,index);
        // return temp;
        // 굳이??????????
        return removeByIndex(arr, indexOf(arr, e));
        /*
         * 해당 메소드가 실행되게 되면 indexOf 가 먼저 실행됨->int 값 받음 이후 removeByIndex(arr,int값) 실행
         * ->int 배열 결과 값 받음 배열을 그대로 return해줌->추가적인 변수지정이 필요가없다.
         */
    }

    // 2. String[]
    // A. 현재 배열의 크기가 얼마인지 알려주는 size()
    public static int size(String[] arr) {
        return arr.length;
    }

    // B. 현재 배열의 특정 인덱스에 저장된 값을 리턴해주는
    // get()
    public static String get(String[] arr, int index) {
        return arr[index];
    }

    // C. 현재 배열이 비어있는지 아닌지를 알려주는
    // isEmpty()
    public static boolean isEmpty(String[] arr) {
        return size(arr) == 0;
    }

    // D. 현재 배열에 특정 값이 존재하는지 리턴해주는
    // contains()
    public static boolean contains(String[] arr, String e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).equals(e)) {

                return true;
            }
        }
        return false;
    }

    // E. 현재 배열에 특정 값이 가장 먼저 등장하는 인덱스가 얼마인지 리턴해주는
    // indexOf()
    // 단, 해당 배열에 그 특정값이 존재하지 않을 시에는 -1이 리턴된다.
    public static int indexOf(String[] arr, String e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).equals(e)) {
                return i;
            }
        }
        return -1;
    }

    // F. 현재 배열에 특정 값의 가장 마지막에 등장하는 인덱스가 얼마인지 리턴에주는
    // lastIndexOf()
    // 단, 해당 배열에 그 특정 값이 존재하지 않을 시에는 -1이 리턴된다.
    public static int lastIndexOf(String[] arr, String e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i).equals(e)) {
                return i;
            }
        }
        return -1;
    }

    // G. 현재 배열에 맨 마지막 칸 뒤에 새로운 요소가 추가되어
    // 크기가 1 늘어난 배열을 리턴해주는
    // add()
    public static String[] add(String[] arr, String e) {
        String[] temp = new String[size(arr) + 1];
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }
        temp[size(temp) - 1] = e;

        return temp;
    }

    // H. 현재 배열에 특정 인덱스에 새로운 값을 추가하고
    // 기존에 있던 값들은 한칸씩 뒤로 밀려난
    // 배열을 리턴해주는 add()
    public static String[] add(String[] arr, int index, String e) {
        String[] temp = new String[0];

//        for(int i=0;i<index;i++) {
//            temp=add(temp,get(arr,i));
//        }
//        temp=add(temp,e);
//        for(int i=index;i<size(arr);i++) {
//            temp=add(temp,get(arr,i));
//        }
        /*
         * 요게 더 짧은 코드
         */
        for (int i = 0; i < size(arr); i++) {
            if (i == index) {
                temp = add(temp, e);
            }
            temp = add(temp, get(arr, i));
        }
        return temp;
    }

    // I. 특정 인덱스의 값을 다른 값으로 교체하고
    // 기존 값을 리턴해서 필요하다면 추가적으로 처리를 할 수 있게하는
    // set()
    public static String set(String[] arr, int index, String e) {
        /*
         * temp 선언이유: 기존값이 필요할수도있걸랑...swap같은거할때
         */
        String temp = get(arr, index);
        arr[index] = e;

        return temp;
    }

    /*
     * int의 경우 2번째 파라미터에 이게 인덱스인지 값인지 애매모호해서 2개로 나눴찌만 String은 오버로딩가능 숫자면 인덱스고 스트링이면
     * 값 제거
     */
    // J. 특정 인덱스를 삭제하는
    // remove()
    // 단, 유효하지 않은 인덱스가 넘어올 경우, 아무것도 삭제되지 않은
    // 원래 배열이 리턴된다.
    public static String[] remove(String[] arr, int index) {
        if (!(index >= 0 && index < size(arr))) {
            return arr;
        }
        String[] temp = new String[0];
        for (int i = 0; i < size(arr); i++) {
            if (i != index) {
                temp = add(temp, get(arr, i));

            }
        }
        return temp;
    }

    // K. 파라미터로 들어온 값을 배열에서 삭제하는
    // remove()
    public static String[] remove(String[] arr, String e) {

        return remove(arr, indexOf(arr, e));
    }

    // 3. Student[]
    // A. 현재 배열의 크기가 얼마인지 알려주는 size()
    public static int size(Student[] arr) {
        return arr.length;
    }

    // B. 현재 배열의 특정 인덱스에 저장된 값을 리턴해주는
    // get()
    public static Student get(Student[] arr, int index) {
        return arr[index];
    }

    // C. 현재 배열이 비어있는지 아닌지를 알려주는
    // isEmpty()
    public static boolean isEmpty(Student[] arr) {
        return size(arr) == 0;
    }

    // D. equals()
    // 내부값을 비교해서 리턴하는 메소드
    public static boolean equals(Student s1, Student s2) {
        return s1.id == s2.id && s1.name.equals(s2.name);
    }

    // E. 현재 배열에 특정 값이 존재하는지 리턴해주는
    // contains()
    public static boolean contains(Student[] arr, Student e) {
        for (int i = 0; i < size(arr); i++) {
//            if (get(arr, i).name.equals(e.name)&&get(arr,i).id==e.id&&get(arr,i).korean==e.korean&&get(arr,i).english==e.english&&get(arr,i).math==e.math) {
            Student s = get(arr, i);
            if (equals(s, e)) {
                /*
                 * 고유값만 비교해도 같은지 다른지 알수있으니 점수는 굳이 필요없다(?)
                 */
                return true;
            }
        }
        return false;
    }

    // F. 현재 배열에 특정 값이 가장 먼저 등장하는 인덱스가 얼마인지 리턴해주는
    // indexOf()
    // 단, 해당 배열에 그 특정값이 존재하지 않을 시에는 -1이 리턴된다.
    public static int indexOf(Student[] arr, Student e) {
        for (int i = 0; i < size(arr); i++) {
            Student s = get(arr, i);
//            if (get(arr, i).name.equals(e.name)&&get(arr,i).id==e.id&&get(arr,i).korean==e.korean&&get(arr,i).english==e.english&&get(arr,i).math==e.math) {
            if (equals(s, e)) {
                /*
                 * contains와 동일이유
                 */
                return i;
            }
        }
        return -1;
    }

    // G. 현재 배열에 특정 값의 가장 마지막에 등장하는 인덱스가 얼마인지 리턴에주는
    // lastIndexOf()
    // 단, 해당 배열에 그 특정 값이 존재하지 않을 시에는 -1이 리턴된다.
    public static int lastIndexOf(Student[] arr, Student e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            Student s = get(arr, i);
//            if (get(arr, i).name.equals(e.name)&&get(arr,i).id==e.id&&get(arr,i).korean==e.korean&&get(arr,i).english==e.english&&get(arr,i).math==e.math) {
            if (equals(s, e)) {
                /*
                 * contains와 동일이유
                 */
                return i;
            }
        }
        return -1;
    }

    // H. 현재 배열에 맨 마지막 칸 뒤에 새로운 요소가 추가되어
    // 크기가 1 늘어난 배열을 리턴해주는
    // add()
    public static Student[] add(Student[] arr, Student e) {
        Student[] temp = new Student[size(arr) + 1];
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }
        temp[size(temp) - 1] = e;

        return temp;
    }

    // I. 현재 배열에 특정 인덱스에 새로운 값을 추가하고
    // 기존에 있던 값들은 한칸씩 뒤로 밀려난
    // 배열을 리턴해주는 add()
    public static Student[] add(Student[] arr, int index, Student e) {
        Student[] temp = new Student[0];

//        for(int i=0;i<index;i++) {
//            temp=add(temp,get(arr,i));
//        }
//        temp=add(temp,e);
//        for(int i=index;i<size(arr);i++) {
//            temp=add(temp,get(arr,i));
//        }
        /*
         * 요게 더 짧은 코드
         */
        for (int i = 0; i < size(arr); i++) {
            if (i == index) {
                temp = add(temp, e);
            }
            temp = add(temp, get(arr, i));
        }
        return temp;
    }

    // J. 특정 인덱스의 값을 다른 값으로 교체하고
    // 기존 값을 리턴해서 필요하다면 추가적으로 처리를 할 수 있게하는
    // set()
    public static Student set(Student[] arr, int index, Student e) {
        /*
         * temp 선언이유: 기존값이 필요할수도있걸랑...swap같은거할때
         */
        Student temp = get(arr, index);
        arr[index] = e;

        return temp;
    }

    // 점수만 수정하는 메소드
    public static Student set(Student[] arr, int index, int korean, int english, int math) {
        /*
         * temp 선언이유: 기존값이 필요할수도있걸랑...swap같은거할때
         */
        Student temp = get(arr, index);
        arr[index].korean = korean;
        arr[index].english = english;
        arr[index].math = math;

        return temp;
    }

    /*
     * int의 경우 2번째 파라미터에 이게 인덱스인지 값인지 애매모호해서 2개로 나눴찌만 String은 오버로딩가능 숫자면 인덱스고 스트링이면
     * 값 제거
     */
    // K. 특정 인덱스를 삭제하는
    // remove()
    // 단, 유효하지 않은 인덱스가 넘어올 경우, 아무것도 삭제되지 않은
    // 원래 배열이 리턴된다.
    public static Student[] remove(Student[] arr, int index) {
//        if (!(index >= 0 && index < size(arr))) {
//            return arr;
//        }
        /*
         * 어차피 범위밖의 인덱스가 들어오면 arr의 모든값이 temp에 추가됨.
         */
        Student[] temp = new Student[0];
        for (int i = 0; i < size(arr); i++) {
            if (i != index) {

                temp = add(temp, get(arr, i));

            }
        }
        return temp;
    }

    // L. 파라미터로 들어온 값을 배열에서 삭제하는
    // remove()
    public static Student[] remove(Student[] arr, Student e) {

        return remove(arr, indexOf(arr, e));
    }

    // 4. Board[]
    // A. 현재 배열의 크기가 얼마인지 알려주는 size()
    public static int size(Board[] arr) {
        return arr.length;
    }

    // B. 현재 배열의 특정 인덱스에 저장된 값을 리턴해주는
    // get()
    public static Board get(Board[] arr, int index) {
        return arr[index];
    }

    // C. 현재 배열이 비어있는지 아닌지를 알려주는
    // isEmpty()
    public static boolean isEmpty(Board[] arr) {
        return size(arr) == 0;
    }

    // D. 현재 배열에 특정 값이 존재하는지 리턴해주는
    // contains()
    public static boolean contains(Board[] arr, Board e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).writer.equals(e.writer) && get(arr, i).id == e.id && get(arr, i).title.equals(e.title)
                    && get(arr, i).contents.equals(e.contents)) {

                return true;
            }
        }
        return false;
    }

    // E. 현재 배열에 특정 값이 가장 먼저 등장하는 인덱스가 얼마인지 리턴해주는
    // indexOf()
    // 단, 해당 배열에 그 특정값이 존재하지 않을 시에는 -1이 리턴된다.
    public static int indexOf(Board[] arr, Board e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).writer.equals(e.writer) && get(arr, i).id == e.id && get(arr, i).title.equals(e.title)
                    && get(arr, i).contents.equals(e.contents)) {
                return i;
            }
        }
        return -1;
    }

    // F. 현재 배열에 특정 값의 가장 마지막에 등장하는 인덱스가 얼마인지 리턴에주는
    // lastIndexOf()
    // 단, 해당 배열에 그 특정 값이 존재하지 않을 시에는 -1이 리턴된다.
    public static int lastIndexOf(Board[] arr, Board e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i).writer.equals(e.writer) && get(arr, i).id == e.id && get(arr, i).title.equals(e.title)
                    && get(arr, i).contents.equals(e.contents)) {
                return i;
            }
        }
        return -1;
    }

    // G. 현재 배열에 맨 마지막 칸 뒤에 새로운 요소가 추가되어
    // 크기가 1 늘어난 배열을 리턴해주는
    // add()
    public static Board[] add(Board[] arr, Board e) {
        Board[] temp = new Board[size(arr) + 1];
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }
        temp[size(temp) - 1] = e;

        return temp;
    }

    // H. 현재 배열에 특정 인덱스에 새로운 값을 추가하고
    // 기존에 있던 값들은 한칸씩 뒤로 밀려난
    // 배열을 리턴해주는 add()
    public static Board[] add(Board[] arr, int index, Board e) {
        Board[] temp = new Board[0];

//        for(int i=0;i<index;i++) {
//            temp=add(temp,get(arr,i));
//        }
//        temp=add(temp,e);
//        for(int i=index;i<size(arr);i++) {
//            temp=add(temp,get(arr,i));
//        }
        /*
         * 요게 더 짧은 코드
         */
        for (int i = 0; i < size(arr); i++) {
            if (i == index) {
                temp = add(temp, e);
            }
            temp = add(temp, get(arr, i));
        }
        return temp;
    }

    // I. 특정 인덱스의 값을 다른 값으로 교체하고
    // 기존 값을 리턴해서 필요하다면 추가적으로 처리를 할 수 있게하는
    // set()
//    public static Board set(Board[] arr, int index,Board e) {
//        /*
//         * temp 선언이유:
//         * 기존값이 필요할수도있걸랑...swap같은거할때
//         */
//        Board temp=get(arr, index);
//        arr[index]=e;
//        
//        return temp;
//    }
    // 제목 및 내용 수정하는 메소드
    public static Board set(Board[] arr, int index, String title, String contents) {
        /*
         * temp 선언이유: 기존값이 필요할수도있걸랑...swap같은거할때
         */
        Board temp = get(arr, index);
        arr[index].title = title;
        arr[index].contents = contents;

        return temp;
    }

    /*
     * int의 경우 2번째 파라미터에 이게 인덱스인지 값인지 애매모호해서 2개로 나눴찌만 String은 오버로딩가능 숫자면 인덱스고 스트링이면
     * 값 제거
     */
    // J. 특정 인덱스를 삭제하는
    // remove()
    // 단, 유효하지 않은 인덱스가 넘어올 경우, 아무것도 삭제되지 않은
    // 원래 배열이 리턴된다.
    public static Board[] remove(Board[] arr, int index) {
        if (!(index >= 0 && index < size(arr))) {
            return arr;
        }
        Board[] temp = new Board[0];
        for (int i = 0; i < size(arr); i++) {
            if (i != index) {

                temp = add(temp, get(arr, i));

            }
        }
        return temp;
    }

    // K. 파라미터로 들어온 값을 배열에서 삭제하는
    // remove()
    public static Board[] remove(Board[] arr, Board e) {

        return remove(arr, indexOf(arr, e));
    }

    // 5. staff
    // A. size()
    public static int size(Staff[] arr) {
        return arr.length;
    }

    // B. get()
    public static Staff get(Staff[] arr, int index) {
        return arr[index];
    }

    // C. isEmpty()
    public static boolean isEmpty(Staff[] arr) {
        return size(arr) == 0;
    }

    // D. contains()
    public static boolean contains(Staff[] arr, Staff e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).id == e.id) {
                return true;
            }
        }
        return false;
    }

    // D-1. contains()-같은이름찾기
    public static boolean contains(Staff[] arr, String e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).name.equals(e) || get(arr, i).team.equals(e)) {
                return true;
            }
        }
        return false;
    }

//    // D-2 contains()-id찾기
//    public static boolean containsOfName(Staff[] arr,int e) {
//        for(int i=0;i<size(arr);i++) {
//            if(get(arr,i).id==e) {
//                return true;
//            }
//        }
//        return false;
//    }
    // D-3 contains()-직급으로찾기
    public static boolean contains(Staff[] arr, char e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).position == e) {
                return true;
            }
        }
        return false;
    }

    // D-4 입사연도로 찾기
    public static boolean contains(Staff[] arr, int e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).year == e) {
                return true;
            }
        }
        return false;
    }

    // E. 현재 배열에 특정 값이 등장하는 인덱스가 얼마인지
    public static int indexOf(Staff[] arr, Staff e) {
        int temp = 0;
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).id == e.id) {
                temp = i;
            }
        }
        return temp;
    }

    // E-1 부서찾기
    public static int[] indexOf(Staff[] arr, String e) {
        int[] temp = new int[0];
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).name.equals(e) || get(arr, i).team.equals(e)) {
                temp = add(temp, i);
            }
        }
        return temp;
    }

    // E-2 입사연도찾기
    public static int[] indexOf(Staff[] arr, int e) {
        int[] temp = new int[0];
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).year == e) {
                temp = add(temp, i);
            }
        }
        return temp;
    }

    // E-3 직급찾기
    public static int[] indexOf(Staff[] arr, char e) {
        int[] temp = new int[0];
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).position == e) {
                temp = add(temp, i);
            }
        }
        return temp;
    }

    // G. add()
    public static Staff[] add(Staff[] arr, Staff e) {
        Staff[] temp = new Staff[size(arr) + 1];
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }
        temp[size(temp) - 1] = e;

        return temp;
    }

    public static Staff[] add(Staff[] arr, int index, Staff e) {
        Staff[] temp = new Staff[0];
        for (int i = 0; i < size(arr); i++) {
            if (i == index) {
                temp = add(temp, e);
            }
            temp = add(temp, get(arr, i));
        }
        return temp;
    }

    // I. set()
    public static Staff set(Staff[] arr, int index, Staff e) {
        Staff temp = get(arr, index);
        arr[index] = e;

        return temp;
    }

    // J. remove()
    public static Staff[] remove(Staff[] arr, int index) {
        Staff[] temp = new Staff[0];
        for (int i = 0; i < size(arr); i++) {
            if (i != index) {
                temp = add(temp, get(arr, i));
            }
        }
        return temp;
    }
//    public static Staff[] remove(Staff[] arr,Staff e) {
//        return remove(arr,index)
//    }

    // A. size()
    public static int size(Employee[] arr) {
        return arr.length;
    }

    // B. get()
    public static Employee get(Employee[] arr, int index) {
        return arr[index];
    }

    // C. isEmpty()
    public static boolean isEmpty(Employee[] arr) {
        return size(arr) == 0;
    }

    // D. equals()
    public static boolean equals(Employee e1, Employee e2) {
        return e1.id == e2.id;
    }
    /*
     * 기능만 사용하려다보니 비교를 Employee  클래스가 아닌 ArrayUtil 메소드에서함...
     * 
     */

    // E. contains()
    public static boolean contains(Employee[] arr, Employee e) {
        for (int i = 0; i < size(arr); i++) {
            Employee temp = get(arr, i);
            if (equals(temp, e)) {
                return true;
            }
        }
        return false;
    }

    // F. indexOf()
    public static int indexOf(Employee[] arr, Employee e) {
        for (int i = 0; i < size(arr); i++) {
            Employee temp = get(arr, i);
            if (equals(temp, e)) {
                return i;
            }
        }
        return -1;
    }

    // G. lastIndexOf()
    public static int lastIndexOf(Employee[] arr, Employee e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            Employee temp = get(arr, i);
            if (equals(temp, e)) {
                return i;
            }
        }
        return -1;
    }

    // H. add()
    public static Employee[] add(Employee[] arr, Employee e) {
        Employee[] temp = new Employee[size(arr) + 1];
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }
        temp[size(temp) - 1] = e;
        return temp;
    }

    // I. add(index)
    public static Employee[] add(Employee[] arr, int index, Employee e) {
        Employee[] temp = new Employee[0];
        for (int i = 0; i < size(arr); i++) {
            if (i == index) {
                temp = add(temp, e);
            }
            temp = add(temp,get(arr, i));
        }
        return temp;
    }
    // J. set()
    public static Employee set(Employee[] arr, int index, Employee e) {
        Employee temp = get(arr, index);
        arr[index]=e;
        
        return temp;
    }
    // K. remove()
    public static Employee[] remove(Employee[] arr, int index) {
        Employee[] temp = new Employee[0];
        for(int i=0;i<size(arr);i++) {
            if(i!=index) {
                temp=add(temp,get(arr,i));
            }
        }
        return temp;
    }
    // L. remove(e)
    public static Employee[] remove(Employee[] arr, Employee e) {
        return remove(arr, indexOf(arr,e));
    }

}
