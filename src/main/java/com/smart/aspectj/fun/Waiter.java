package com.smart.aspectj.fun;

import com.smart.aspectj.anno.NeedTest;

public interface Waiter {
	@NeedTest
	void greetTo(String clientName);
	void serveTo(String clientName);
}
