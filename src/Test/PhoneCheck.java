package Test;

public class PhoneCheck {
    Boolean checkPhone(String str) throws PhoneException {
        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        // Kiem tra dinh dang
        return str.matches(reg);
    }
}
