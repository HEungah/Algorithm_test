package test_java;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char mostFrequent = findMostFrequentCharacter(word);
        System.out.println(Character.toUpperCase(mostFrequent));
    }
    
    private static char findMostFrequentCharacter(String word) {
        // 대소문자 구분을 없애기 위해 모두 소문자로 변환
        word = word.toLowerCase();
       
        // 알파벳 빈도수를 저장할 배열 생성
        int[] frequencyArray = new int[26]; // 알파벳 개수만큼의 크기
        
        // 각 알파벳의 빈도수 계산
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) { // 알파벳인 경우에만 처리
                int index = c - 'a'; // 알파벳의 인덱스 계산
                frequencyArray[index]++;
            }
        }
        
        int maxFrequency = 0;
        char mostFrequent = '?';
        
        // 가장 많이 사용된 알파벳 찾기
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > maxFrequency) {
                maxFrequency = frequencyArray[i];
                mostFrequent = (char) (i + 'a'); // 인덱스를 알파벳으로 변환
            } else if (frequencyArray[i] == maxFrequency) {
                mostFrequent = '?'; // 가장 많은 알파벳이 여러 개인 경우 '?'로 설정
            }
        }
        
        return mostFrequent;
    }
}
