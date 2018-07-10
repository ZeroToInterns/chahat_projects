import java.util.Iterator;
import java.util.Stack;


class ReveiwStack {
    public int[] dailyTemperatures(int[] temperatures) {
//       
//        int[] result = new int[temperatures.length];
//        int count = 0;
//        int index = -1;
//        Stack<Integer>myStack = new Stack<Integer>();
//        for(int i = temperatures.length -1 ; i >=0 ;i--)
//        {
//            myStack.add(temperatures[i]);
//        }
//        
//        while(!myStack.empty())
//        {
//        	index++;
//        	int i = index + 1;
//        	while(i < temperatures.length)
//        	{
//        		count++;
//        		if(temperatures[i] > myStack.peek())
//        		{
//        			result[index] =  count;
//        			count = 0;
//        			break;
//        		}
//        		i++;
//        		
//        	}
//        	count = 0;
//        	myStack.pop();
//        }
//        return result;
    	
    	int[] result = new int[temperatures.length];
    	Stack<Integer> stack = new Stack<Integer>(); // Make it a stack of indices.
    	for (int i = 0; i < temperatures.length; i++) {
    	    while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
    	        int index = stack.pop();
    	        result[index] = i - index;
    	    }
    	    stack.push(i);
    	}
    	return result;
      }
   }