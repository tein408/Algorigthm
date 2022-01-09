package leetcode.medium;

public class LC1041 {

    public boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        int direction = 0;

        for(char c : instructions.toCharArray()) {
            if(c == 'G') {
                if(direction == 0)
                    y++;
                else if(direction == 1)
                    x++;
                else if(direction == 2)
                    y--;
                else if(direction == 3)
                    x--;
            } else if(c == 'L') {
                direction = (direction + 3) % 4;
            } else if(c == 'R') {
                direction = (direction + 1) % 4;
            }
        }

        if(direction != 0 || (x == 0 && y == 0)) {
            return true;
        }

        return false;
    }

}
