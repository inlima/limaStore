<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Detalhes da Conta</h1>

            <p class="lead">Aqui está suas informaçoes!</p>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="<c:url value="/resources/images/avatar.png" /> " alt="image" style="width:75%"/>
                </div>

                <div class="col-md-5">
                    <h2>${customer.customerName} <a href="<spring:url value="/account/viewCustomer/editCustomer/${customer.customerId}" />"
                    ><span class="glyphicon glyphicon-pencil"></span></a></h2>
                    <p>
                        <strong>User</strong> ${customer.username}
                    </p>
                    <p>
                        <strong>Senha:</strong> ${customer.password}
                    </p>
                    <p>
                        <strong>Número de Telefone:</strong> ${customer.customerPhone}
                    </p>
                    <p>
                        <strong>Email:</strong> ${customer.customerEmail}
                    </p>
                    <p>
                        <strong>Nickname:</strong> ${customer.nickname}
                    </p>
                    <p>
                        <strong>Status do Perfil: </strong><c:if test="${customer.enabled == false}">Deactivate</c:if><c:if test="${customer.enabled == true}">Active</c:if>
                    </p>

                    <p>
                        <strong>Endereço de Entrega:</strong>
                        <ul style="list-style-type:none">
                            <li>Nome da Rua: ${customer.shippingAddress.streetName}</li>
                            <li>Número: ${customer.shippingAddress.apartmentNumber}</li>
                            <li>Cidade: ${customer.shippingAddress.city}</li>
                            <li>Estado: ${customer.shippingAddress.state}</li>
                            <li>País: ${customer.shippingAddress.country}</li>
                            <li>CEP: ${customer.shippingAddress.zipCode}</li>
                        </ul>
                    </p>

                </div>

            </div>
        </div>
