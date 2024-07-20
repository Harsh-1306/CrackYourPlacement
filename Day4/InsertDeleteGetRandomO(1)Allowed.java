class RandomizedCollection {
    ArrayList<Integer>list;
   public RandomizedCollection() {
       list=new ArrayList<>();
   }
   
   public boolean insert(int val) {
       if(list.contains(val))
       {
           list.add(val);
           return false;
       }
       else
       {
           list.add(val);
           return true;
       }
   }
   
   public boolean remove(int val) {
       if(list.contains(val))
       {
           list.remove(Integer.valueOf(val));
           return true;
       }
       return false;
   }
   
   public int getRandom() {
       Random random=new Random();
       int rand=random.nextInt(list.size());
       return list.get(rand);
   }
}

