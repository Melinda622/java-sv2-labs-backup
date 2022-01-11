package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private List<Feature> features;
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        this.features = features;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int fullLengthAtOneItem() {
        int sum = 0;
        for (Feature f : features) {
            if (f instanceof AudioFeatures) {
                sum += ((AudioFeatures) f).getLength();
            }
        }
        return sum;
    }

    public int numberOfPagesAtOneItem() {
        int sum = 0;
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                sum += ((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return sum;
    }

    public int numberOfPagesAtOneItemOver(int number) {
        int sum = 0;
        for (Feature f : features) {
            if (f instanceof PrintedFeatures&&((PrintedFeatures) f).getNumberOfPages()>number) {
                sum += ((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return sum;
    }

    public int countNumberOfPagesAtOneItemOver(int number) {
        int count= 0;
        for (Feature f : features) {
            if (f instanceof PrintedFeatures&&((PrintedFeatures) f).getNumberOfPages()>number) {
               count++;
            }
        }
        return count;
    }

    public List<String> getTitles() {
        List<String>titles=new ArrayList<>();
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                titles.add(f.getTitle());
            } else if (f instanceof AudioFeatures) {
                titles.add(f.getTitle());
            }
        }
        return titles;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                for (int i = 0; i < f.getContributors().size(); i++) {
                    contributors.add(f.getContributors().get(i));
                }
            } else if (f instanceof AudioFeatures) {
                for (int i = 0; i < f.getContributors().size(); i++) {
                    contributors.add(f.getContributors().get(i));
                }
            }
        }
        return contributors;
    }

    public boolean hasAudioFeature() {

        for (Feature f : features) {
            if (f instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {

        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static void main(String[] args) {
        CatalogItem catalogItem1 = new CatalogItem("R-1", 300,
                Arrays.asList(new AudioFeatures("Night Visions", 185, Arrays.asList("Dan Raynolds"), Arrays.asList("Imagine Dragons")),
                        new PrintedFeatures("Harry Potter", 600, Arrays.asList("J.K. Rowling")),
                        new AudioFeatures("Piece of Mind", 200, Arrays.asList("Steve Harris"), Arrays.asList("Iron Maiden")))

        );

        CatalogItem catalogItem2 = new CatalogItem("R- 2", 300,
                Arrays.asList(new PrintedFeatures("Harry Potter", 500, Arrays.asList("J.K. Rowling")))
        );


        CatalogItem catalogItem3 = new CatalogItem("R-3", 300,
                Arrays.asList(new AudioFeatures("Californication", 100, Arrays.asList("Flea"), Arrays.asList("RHCP")))
        );

        System.out.println(catalogItem1.numberOfPagesAtOneItemOver(100));
        System.out.println(catalogItem2.numberOfPagesAtOneItemOver(100));
        System.out.println(catalogItem3.numberOfPagesAtOneItemOver(100));
    }
}
