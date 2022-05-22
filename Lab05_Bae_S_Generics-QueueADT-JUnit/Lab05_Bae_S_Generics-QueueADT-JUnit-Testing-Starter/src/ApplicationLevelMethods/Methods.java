package ApplicationLevelMethods;

import queuePackage.LinkedUnbndQueue;

public class Methods {

	// make a copy of orig queue, leaving it unchanged
	public static LinkedUnbndQueue<String> copyQueue(LinkedUnbndQueue<String> origQ) {
		LinkedUnbndQueue<String> q1, q2;
		q1 = new LinkedUnbndQueue<String>();
		q2 = new LinkedUnbndQueue<String>();
		// copyQueue code goes here

		if (origQ == null) {
			return null;
		}

		else {
			while (!origQ.isEmpty()) {
				String string = origQ.dequeue();
				q1.enqueue(string);
				q2.enqueue(string);
			}
			while (!q2.isEmpty()) {
				origQ.enqueue(q2.dequeue());
			}
			return q1;
		}
	}

	// return a count of the number of elements of the orig queue, leaving it
	// unchanged
	public static int count(LinkedUnbndQueue<String> origQ) {
		int count = 0;
		if (origQ == null) {
			return count;
		} else if (origQ.isEmpty()) {
			return count;
		} else {
			LinkedUnbndQueue<String> q1, q2;
			q1 = new LinkedUnbndQueue<String>();
			q2 = new LinkedUnbndQueue<String>();
		// count code goes here
		while (!origQ.isEmpty()) {
			String string = origQ.dequeue();
			q1.enqueue(string);
			q2.enqueue(string);
			count++;
		}
		while (!q2.isEmpty()) {
			origQ.enqueue(q2.dequeue());
		}
		return count;
		}		
	}

	// return a nicely formatted string representing the queue, leaving it unchanged
	public static String showQueue(LinkedUnbndQueue<String> origQ) {
		String string;
		if (origQ == null) {
			string = "null";
		}
		else  if (origQ.isEmpty()){

			string = "empty";
		}
		else {
			string = "front|";
			LinkedUnbndQueue<String> q1;
			q1 = new LinkedUnbndQueue<String>();
			// showQueue code goes here
			while (!origQ.isEmpty()) {
				String element = origQ.dequeue();
				q1.enqueue(element);
				string = string + element + "|";
			}
			while (!q1.isEmpty()) {
				origQ.enqueue(q1.dequeue());
			}
			string = string + "rear";

		}
		return string;
		}

}
