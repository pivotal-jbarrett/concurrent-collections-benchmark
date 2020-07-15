package com.vmlens.concurrent.queue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeBenchmark extends AbstractBenchmark {



	public ConcurrentLinkedDequeBenchmark() {
		super(new ConcurrentLinkedDeque());
	}

	
	
}
