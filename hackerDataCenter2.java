public class hackerDataCenter2 {

    public int[] solve(String direction, int x, int y, int width, int height) {
        int[] result = new int[2];
        if (direction.contains("D") && y < height - 1) {
            y += 1;
        } else if (direction.contains("U") && y > 0) {
            y -= 1;
        }
        if (direction.contains("R") && x < width - 1) {
            x += 1;
        } else if (direction.contains("L") && x > 0) {
            x -= 1;
        }
        if (x == width - 1 && y == height - 1) {
            return new int[]{x, y};
        }
        return new int[]{x, y};
    }
    public static void main(String[] args) {
        hackerDataCenter2 hackerDataCenter = new hackerDataCenter2();
        int[] result = hackerDataCenter.solve("DR", 0, 0, 5, 5);
        System.out.println(result[0] + " " + result[1]);
    }
}
