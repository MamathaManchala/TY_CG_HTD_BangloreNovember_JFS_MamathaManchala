
public class Son implements Father1,Father2 {


@Override
public void house() {
	Father1.super.house();
}
}
