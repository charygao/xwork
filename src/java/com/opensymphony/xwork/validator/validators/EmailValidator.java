/*
 * Copyright (c) 2002-2006 by OpenSymphony
 * All rights reserved.
 */
package com.opensymphony.xwork.validator.validators;


/**
 * <!-- START SNIPPET: javadoc -->
 * EmailValidator checks that a given String field, if not empty,
 * is a valid email address.
 * <p/>
 * <p/>
 * The regular expression used to validate that the string is an email address
 * is:
 * </p>
 * <pre>
 * \\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+((\\.com)|(\\.net)|(\\.org)|(\\.info)|(\\.edu)|(\\.mil)|(\\.gov)|(\\.biz)|(\\.ws)|(\\.us)|(\\.tv)|(\\.cc)|(\\.aero)|(\\.arpa)|(\\.coop)|(\\.int)|(\\.jobs)|(\\.museum)|(\\.name)|(\\.pro)|(\\.travel)|(\\.nato)|(\\..{2,3})|(\\..{2,3}\\..{2,3}))$)\\b
 * </pre>
 * <!-- END SNIPPET: javadoc -->
 * 
 * 
 * <!-- START SNIPPET: parameters -->
 * <ul>
 * 		<li>fieldName - The field name this validator is validating. Required if using Plain-Validator Syntax otherwise not required</li>
 * </ul>
 * <!-- END SNIPPET: parameters -->
 * 
 * 
 * <pre>
 * <!-- START SNIPPET: example -->
 *     &lt;!-- Plain Validator Syntax --&gt;
 *     &lt;validators&gt;
 *         &lt;validator type="email"&gt;
 *             &lt;param name="fieldName"&gt;myEmail&lt;/param&gt;
 *             &lt;message&gt;Must provide a valid email&lt;/message&gt;
 *         &lt;/validator&gt;
 *     &lt;/validators&gt;
 *     
 *     &lt;!-- Field Validator Syntax --&gt;
 *     &lt;field name="myEmail"&gt;
 *        &lt;field-validator type="email"&gt;
 *           &lt;message&gt;Must provide a valid email&lt;/message&gt;
 *        &lt;/field-validator&gt;
 *     &lt;/field&gt;
 * <!-- END SNIPPET: example -->
 * </pre>
 *
 * @author jhouse
 * @author tm_jee
 * @version $Date: 2006-05-12 17:38:31 +0900 (金, 12 5 2006) $ $Id: EmailValidator.java 1012 2006-05-12 08:38:31Z tmjee $
 */
public class EmailValidator extends RegexFieldValidator {

	// see XW-371 
    public static final String emailAddressPattern =
    	"\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b";

    public EmailValidator() {
        setExpression(emailAddressPattern);
        setCaseSensitive(false);
    }

}


