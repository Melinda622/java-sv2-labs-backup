package searching;

import java.util.Arrays;

public class Mountain {

    int[] heights;

    public Mountain(int[] heights) {
        this.heights = heights;
    }

    public boolean searchPike(Peak peak){
        Arrays.sort(heights);
        return Arrays.binarySearch(heights, peak.getHeight())>0;
    }
}
