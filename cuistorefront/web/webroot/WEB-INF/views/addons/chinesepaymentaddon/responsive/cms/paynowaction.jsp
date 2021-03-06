<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<spring:url value="/checkout/multi/summary/payRightNow/${orderData.code}" var="payRightNowUrl"/>

<c:if test="${orderData.status.code != 'CANCELLED' and orderData.paymentStatus.code eq 'NOTPAID'}">
	<div class="label-order">
		<a id="payRightNowButton" class="payment-action" data-href="${payRightNowUrl}"
				data-payment="${orderData.chinesePaymentInfo.paymentProvider}" href="javascript:;" target="_blank"> 
			<spring:theme code="order.detail.button.pay.immediately" text="PayImmediately" htmlEscape="true"/>
		</a>
	</div>
</c:if>
