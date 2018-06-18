package part_08;

public class SelfTestCh10 {
        public static void main(String[] args) {
            StackException myStack = new StackException(100);


            for (int d = 0; d < 100; d++) {         //this is putting information into the stack
                myStack.put(d);
            }

            for (int d = 0; d < 100; d++) {
                int c = myStack.get();             // this is getting the information from the queue and stores the
                // values into c one by one. then the number if printed if the following
                if (d % 2 == 0) {
                    System.out.println(c);
                }
            }
        }
    }




    class StackException {



        // these members are now private

        private int stackArray[];                                       // this array holds the queue
        private int location;                                           // the put and get indices


        StackException(int size) {                                      // this is a contructor which is used to create an object
            stackArray = new int[size];                                 // allocate memory for queue
            location = 0;
        }                                                               // index






        // Put a ints into the stack.
        void put(int i) {                                              //method to see whether the you can put anything else in
            try {
                if (location == stackArray.length){
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.out.println(" -- StackController is full.");
            }
            stackArray[location++] = i;
        }




        int get() {
            try{
                if(location == 0){
                    throw new Exception();
                }
            } catch (Exception ex1){
                System.out.println(" -- StackController is empty.");
                return 0;
            }

            return stackArray[location--];
        }
    }

