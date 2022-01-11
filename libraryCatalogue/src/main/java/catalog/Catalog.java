package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    public List<CatalogItem> catalogItems=new ArrayList<>();

    public void addItem(CatalogItem item) {
        catalogItems.add(item);
    }

    public int averagePageNumberOver(int number) {
        if(number<=0){
            throw new IllegalArgumentException("Page number must be positive");
        }
        int sum = 0;
        int count = 0;
        int average = 0;

        for (CatalogItem c : catalogItems) {
            sum += c.numberOfPagesAtOneItemOver(number);
            if(c.numberOfPagesAtOneItemOver(number)!=0){
                count++;
            }
        }
        if (sum==0){
            throw new IllegalArgumentException("No page");
        }

        double averageDouble=sum/(double) count;
        average = Math.round(sum / count);
        return average;
    }


    public void deleteItemByRegistrationNumber(String registrationNumber) {
        List<CatalogItem> toBeDeleted = new ArrayList<>();

        for (CatalogItem c : catalogItems) {
            if (c.getRegistrationNumber().equals(registrationNumber)) {
                toBeDeleted.add(c);
            }
        }
        catalogItems.removeAll(toBeDeleted);
    }

    public int getAllPageNumber() {
        int sum = 0;

        for (CatalogItem c : catalogItems) {
            sum += c.numberOfPagesAtOneItem();
        }
        return sum;
    }

    public int getFullLength() {
        int sum = 0;

        for (CatalogItem c : catalogItems) {
            sum += c.fullLengthAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> getAudioLibraryItems() {

        List<CatalogItem> audioItems = new ArrayList<>();

        for (CatalogItem c : catalogItems) {
            if (c.hasAudioFeature()) {
                audioItems.add(c);
            }
        }
        return audioItems;
    }

    public List<CatalogItem> getPrintedLibraryItems() {

        List<CatalogItem> printedItems = new ArrayList<>();

        for (CatalogItem c : catalogItems) {
            if (c.hasPrintedFeature()) {
                printedItems.add(c);
            }
        }
        return printedItems;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria criteria) {

        List<CatalogItem> result = new ArrayList<>();

        if (criteria.hasTitle() && criteria.hasContributor()) {
            criteria = SearchCriteria.createByBoth(criteria.getTitle(),criteria.getContributor());

            for (CatalogItem c : catalogItems) {
                for (int i = 0; i < c.getFeatures().size(); i++) {
                    for (int j = 0; j < c.getFeatures().get(i).getContributors().size(); j++) {
                        if (c.getFeatures().get(i).getContributors().get(j).equalsIgnoreCase(criteria.getContributor())&&
                                c.getFeatures().get(i).getTitle().equalsIgnoreCase(criteria.getTitle())
                        ) {
                            result.add(c);
                        }
                    }
                }
            }




        } else if (!criteria.hasContributor() && criteria.hasTitle()) {
            criteria = SearchCriteria.createByTitle(criteria.getTitle());

            for (CatalogItem c : catalogItems) {
                for (int i = 0; i < c.getFeatures().size(); i++) {
                    if (c.getFeatures().get(i).getTitle().equalsIgnoreCase(criteria.getTitle())) {
                        result.add(c);
                    }
                }
            }

        } else if (criteria.hasContributor() && !criteria.hasTitle()) {
            criteria = SearchCriteria.createByContributor(criteria.getContributor());


            for (CatalogItem c : catalogItems) {
                for (int i = 0; i < c.getFeatures().size(); i++) {
                    for (int j = 0; j < c.getFeatures().get(i).getContributors().size(); j++) {
                        if (c.getFeatures().get(i).getContributors().get(j).equalsIgnoreCase(criteria.getContributor())) {
                            result.add(c);
                        }
                    }
                }
            }

        } return result;
    }
}
