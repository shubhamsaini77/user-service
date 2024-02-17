package org.banking.core.user;

import org.banking.core.common.WhiteRoseJSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserHelper {

    private static Logger logger = LoggerFactory.getLogger(UserHelper.class);
    public User createUser(User user, String locale) throws Exception {
        UserDataAccess userDataAccess = new UserDataAccess();
        List<UserAddressDetails> userAddressDetails = user.getUserAddressDetails();
        logger.info("---------------userAddressDetails JSON: {} ----------", WhiteRoseJSONUtil.createJson(userAddressDetails.get(0)));
        user = userDataAccess.createUser(user, locale);
        return user;
    }

}
