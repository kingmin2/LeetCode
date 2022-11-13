public class Solution {
    List<List<Integer>> ret;
    public List<List<Integer>> permuteUnique(int[] num) {
        ret = new LinkedList<>();
        Arrays.sort(num);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num.length; i++)
            numbers.add(num[i]);
        boolean[] visited = new boolean[num.length];
        LinkedList<Integer> list = new LinkedList<>();
        permuteUnique(numbers, list, visited);
        return ret;
    }
 
    private void permuteUnique(List<Integer> numbers, List<Integer> list, boolean[] visited) {
        if (list.size() == numbers.size()) {
            LinkedList<Integer> newList = new LinkedList<>();
            newList.addAll(list);
            ret.add(newList);
            return;
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (visited[i])
                continue;
            int candidate = numbers.get(i);
            if (i > 0 && numbers.get(i - 1) == candidate && visited[i - 1])
                continue;
            visited[i] = true;
            list.add(candidate);
            permuteUnique(numbers, list, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}