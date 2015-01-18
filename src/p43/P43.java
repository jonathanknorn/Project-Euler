package p43;

import res.Euler;

public class P43 extends Euler {

	public static void main(String[] args) {
		Euler p = new P43();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		long res = 0;
		int[] pr = { 2, 3, 5, 7, 11, 13, 17 };
		int[] a = new int[10];
		for (a[0] = 0; a[0] <= 9; a[0]++) {
			for (a[1] = 0; a[1] <= 9; a[1]++) {
				while (a[1] == a[0]) {
					a[1]++;
				}
				if (a[1] <= 9) {
					for (a[2] = 0; a[2] <= 9; a[2]++) {
						while (a[2] == a[0] || a[2] == a[1]) {
							a[2]++;
						}
						if (a[2] <= 9) {
							for (a[3] = 0; a[3] <= 9; a[3]++) {
								while (a[3] == a[0] || a[3] == a[1]
										|| a[3] == a[2]) {
									a[3]++;
								}
								if (a[3] <= 9) {
									for (a[4] = 0; a[4] <= 9; a[4]++) {
										while (a[4] == a[0] || a[4] == a[1]
												|| a[4] == a[2] || a[4] == a[3]) {
											a[4]++;
										}
										if (a[4] <= 9) {
											for (a[5] = 0; a[5] <= 9; a[5]++) {
												while (a[5] == a[0]
														|| a[5] == a[1]
														|| a[5] == a[2]
														|| a[5] == a[3]
														|| a[5] == a[4]) {
													a[5]++;
												}
												if (a[5] <= 9) {
													for (a[6] = 0; a[6] <= 9; a[6]++) {
														while (a[6] == a[0]
																|| a[6] == a[1]
																|| a[6] == a[2]
																|| a[6] == a[3]
																|| a[6] == a[4]
																|| a[6] == a[5]) {
															a[6]++;
														}
														if (a[6] <= 9) {
															for (a[7] = 0; a[7] <= 9; a[7]++) {
																while (a[7] == a[0]
																		|| a[7] == a[1]
																		|| a[7] == a[2]
																		|| a[7] == a[3]
																		|| a[7] == a[4]
																		|| a[7] == a[5]
																		|| a[7] == a[6]) {
																	a[7]++;
																}
																if (a[7] <= 9) {
																	for (a[8] = 0; a[8] <= 9; a[8]++) {
																		while (a[8] == a[0]
																				|| a[8] == a[1]
																				|| a[8] == a[2]
																				|| a[8] == a[3]
																				|| a[8] == a[4]
																				|| a[8] == a[5]
																				|| a[8] == a[6]
																				|| a[8] == a[7]) {
																			a[8]++;
																		}
																		if (a[8] <= 9) {
																			for (a[9] = 0; a[9] <= 9; a[9]++) {
																				while (a[9] == a[0]
																						|| a[9] == a[1]
																						|| a[9] == a[2]
																						|| a[9] == a[3]
																						|| a[9] == a[4]
																						|| a[9] == a[5]
																						|| a[9] == a[6]
																						|| a[9] == a[7]
																						|| a[9] == a[8]) {
																					a[9]++;
																				}
																				if (a[9] <= 9) {
																					boolean pri = true;
																					for (int i = 1; i < 8; i++) {
																						int ass = a[i]
																								* 100
																								+ a[i + 1]
																								* 10
																								+ a[i + 2];
																						if (ass
																								% pr[i - 1] != 0) {
																							pri = false;
																							break;
																						}
																					}
																					if (pri) {
																						String s = "";
																						for (int i : a) {
																							s += i;
																						}

																						res += new Long(s);
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return res;
	}

	@Override
	public String getName() {
		return "P43";
	}

	@Override
	public String description() {
		return "The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits\n"
				+ "0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.\n\n"
				+ "Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:\n\n"
				+ "\td2d3d4=406 is divisible by 2\n"
				+ "\td3d4d5=063 is divisible by 3\n"
				+ "\td4d5d6=635 is divisible by 5\n"
				+ "\td5d6d7=357 is divisible by 7\n"
				+ "\td6d7d8=572 is divisible by 11\n"
				+ "\td7d8d9=728 is divisible by 13\n"
				+ "\td8d9d10=289 is divisible by 17\n\n"
				+ "Find the sum of all 0 to 9 pandigital numbers with this property.";
	}

}
