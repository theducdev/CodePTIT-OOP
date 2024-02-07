import java.util.*;

public class Bai13_th2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Set<String>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] compa = scanner.nextLine().split(" ");
            String s1 = compa[0];
            String ope = compa[1];
            String s2 = compa[2];

            graph.putIfAbsent(s1, new HashSet<>());
            graph.putIfAbsent(s2, new HashSet<>());

            if (ope.equals(">")) {
                graph.get(s1).add(s2);
            }else{
                graph.get(s2).add(s1);
            }
        }
        boolean res = isPossible(graph);
        System.out.println(res ? "possible" : "impossible");

    }
    public static boolean isPossible(Map<String, Set<String>> graph) {
        Set <String> visited = new HashSet<>();
        Set <String> stack = new HashSet<>();
        for (String x : graph.keySet()) {
            if (!visited.contains(x)) {
                if (hasCycle(graph, x, visited, stack)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean hasCycle (Map <String, Set <String>> graph, String student, Set <String> visited,Set <String> stack  ) {
        visited.add(student);
        stack.add(student);
        for (String x : graph.get(student) ) {
            if (!visited.contains(x)) {
                if (hasCycle(graph, x, visited, stack)) {
                    return true;
                }
            }else if (stack.contains(x)) {
                return true;
            }
        }
        stack.remove(student);
        return false;
    }
}
