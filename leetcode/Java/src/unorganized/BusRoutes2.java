package unorganized;

public class BusRoutes2 {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target) return 0;

        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();


        //this initializes a hashmap with each stop as key, and buses that come to this step as keys (could be
        // multiple buses coming to one stop
        for(int i=0;i<routes.length;i++) {
            for(int stop : routes[i]) {
                if(stop == source) {
                    queue.offer(i);
                    visited.add(i);
                }

                if(!map.containsKey(stop)) {
                    map.put(stop, new ArrayList<>());
                }

                map.get(stop).add(i);
            }
        }


        int step = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++) {
                int currBus = queue.poll();

                for(int stop : routes[currBus]) {
                    if(stop == target) { //if this bus goes to target stop, then we know this is the final step
                        // and we should return
                        return step;
                    }

                    if(map.containsKey(stop)) {

                        //if not, find the next bus we can go to for further more stops
                        // says searching all stops for routes[1], some stops might have keys for other buses
                        // such as routes[2] or routes[3]

                        for(int nextBus : map.get(stop)) {
                            if(visited.contains(nextBus)) continue; //avoid visiting the same bus (bus travel through
                                                                    //stops) twice
                            visited.add(nextBus);
                            queue.offer(nextBus);
                        }

                        map.remove(stop); // this line of code significantly reduce runtime
                                            // avoid searching already searched useless key multiple times
                    }
                }
            }
            step++;
        }

        return -1;
    }
}
