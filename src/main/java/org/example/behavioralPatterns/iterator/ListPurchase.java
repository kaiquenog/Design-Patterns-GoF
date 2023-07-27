package org.example.behavioralPatterns.iterator;

public class ListPurchase implements  Container {

    String listPurchase[] = {"A","B","C","D"};


    @Override
    public Iterator getIterator() {
        return new ListPurchaseIterator();
    }
    private class ListPurchaseIterator implements Iterator {

        int index;
        @Override
        public boolean hasNext() {
            if(index< listPurchase.length) return  true;

            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext())return listPurchase[index++];
            return null;
        }
    }
}
