package com.algorithm.study.day12;


import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        Map<String, Map<String,Integer>> total = new HashMap<>();
        Map<String, Map<Integer,Integer>>  genresMap= new HashMap<>();

        for(int i =0; i<genres.length;i++){
            String key = genres[i];
            int play = plays[i];
            if(total.containsKey(key)){
                Map<String, Integer> map = total.get(key);
                map.put("count",map.get("count")+1);
                map.put("total",map.get("total")+play);
                Map<Integer, Integer> integerIntegerMap = genresMap.get(key);
                integerIntegerMap.put(i, play);
            }else{
                HashMap<String, Integer> map = new HashMap<>();
                map.put("count", 1);
                map.put("total", play);
                total.put(key,map);
                HashMap<Integer, Integer> map2 = new HashMap<>();
                map2.put(i, play);
                genresMap.put(key, map2);
            }
        }
        List<Integer> integers = new ArrayList<>();
        for(String key:total.keySet()){
            integers.add(total.get(key).get("total"));
        }
        integers.sort(Comparator.reverseOrder());
        List<String> keySort = new ArrayList<>();
        int count = 0;
        for(String key:total.keySet()){
            for(Integer integer:integers){
                Integer integer1 = total.get(key).get("total");
                if(integer.equals(integer1) && count <=4 ){
                    count += total.get(key).get("count");
                    keySort.add(key);
                }
            }
        }
        List<Integer> answers  = new ArrayList<>();

        for(String key:keySort){
            Map<Integer, Integer> map = genresMap.get(key);
            if(map.size()==1){
                answers.add(map.keySet().iterator().next());
            } else {
                List<Integer> tt = new ArrayList<>(map.values());
                tt.sort(Comparator.reverseOrder());
                List<Integer> tt2 = new ArrayList<>();
                for(int i = 0; i<2; i++){
                    Integer integer = tt.get(i);
                    for(Integer key2:map.keySet()){
                        Integer integer1 = map.get(key2);
                        if(integer.equals(integer1)){
                            tt2.add(key2);
                        }
                    }
                }
                if(tt2.size()==2){
                    answers.addAll(tt2);
                }else{
                    answers.addAll(tt2.subList(0,2));
                }
            }

        }
        int []aa = new int[answers.size()];
        int ide = 0;
        for(Integer anInteger:answers){
            aa[ide++] = anInteger;
        }
        return aa;
    }
}





/*

2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
  public class Music implements Comparable<Music>{

    private int played;
    private int id;
    private String genre;

    public Music(String genre, int played, int id) {
      this.genre = genre;
      this.played = played;
      this.id = id;
    }

    @Override
    public int compareTo(Music other) {
      if(this.played == other.played) return this.id - other.id;
      return other.played - this.played;
    }

    public String getGenre() {return genre;}
  }

  public int[] solution(String[] genres, int[] plays) {
    return IntStream.range(0, genres.length)
    .mapToObj(i -> new Music(genres[i], plays[i], i))
    .collect(Collectors.groupingBy(Music::getGenre))
    .entrySet().stream()
    .sorted((a, b) -> sum(b.getValue()) - sum(a.getValue()))
    .flatMap(x->x.getValue().stream().sorted().limit(2))
    .mapToInt(x->x.id).toArray();
  }

  private int sum(List<Music> value) {
    int answer = 0;
    for (Music music : value) {
      answer+=music.played;
    }
    return answer;
  }
}
 */