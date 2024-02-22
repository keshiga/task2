
    import java.util.*;

    interface adder<T extends Number> {
        T zero();
        T add(T lhs, T rhs); // Adding two items
    }

    class adding<T extends Number> {
        public T total(List<T> list, adder<T> adder) {

            T total = adder.zero();
            for (T n : list){
                total = adder.add(total, n);
            }
            return total;
        }
    }

    public class generic_method {
        public static void main(String[] args) {


            List<Integer> list = new ArrayList<Integer>(2);
            list.add(1);
            list.add(2);

            adding<Integer> calc = new adding<Integer>();

            Integer total = calc.total(list, new adder<Integer>() {
                public Integer add(Integer a, Integer b) {
                    return a+b;
                }
                public Integer zero() {
                    return 0;
                }
            });
            System.out.println("toatl is : "+total);
        }
    }

