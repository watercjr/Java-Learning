
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income{

	RoyaltyIncome(double income) {
		super(income);
	}
	
	@Override
	public double getTax() {
		return this.income * 0.2;
	}

}
