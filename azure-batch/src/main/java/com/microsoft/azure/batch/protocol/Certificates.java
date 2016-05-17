/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol;

import com.microsoft.azure.batch.protocol.models.BatchErrorException;
import com.microsoft.azure.batch.protocol.models.Certificate;
import com.microsoft.azure.batch.protocol.models.CertificateAddHeaders;
import com.microsoft.azure.batch.protocol.models.CertificateAddOptions;
import com.microsoft.azure.batch.protocol.models.CertificateAddParameter;
import com.microsoft.azure.batch.protocol.models.CertificateCancelDeletionHeaders;
import com.microsoft.azure.batch.protocol.models.CertificateCancelDeletionOptions;
import com.microsoft.azure.batch.protocol.models.CertificateDeleteHeaders;
import com.microsoft.azure.batch.protocol.models.CertificateDeleteOptions;
import com.microsoft.azure.batch.protocol.models.CertificateGetHeaders;
import com.microsoft.azure.batch.protocol.models.CertificateGetOptions;
import com.microsoft.azure.batch.protocol.models.CertificateListHeaders;
import com.microsoft.azure.batch.protocol.models.CertificateListNextOptions;
import com.microsoft.azure.batch.protocol.models.CertificateListOptions;
import com.microsoft.azure.batch.protocol.models.PageImpl;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in Certificates.
 */
public interface Certificates {
    /**
     * Adds a certificate to the specified account.
     *
     * @param certificate The certificate to be added.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, CertificateAddHeaders> add(CertificateAddParameter certificate) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Adds a certificate to the specified account.
     *
     * @param certificate The certificate to be added.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall addAsync(CertificateAddParameter certificate, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Adds a certificate to the specified account.
     *
     * @param certificate The certificate to be added.
     * @param certificateAddOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, CertificateAddHeaders> add(CertificateAddParameter certificate, CertificateAddOptions certificateAddOptions) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Adds a certificate to the specified account.
     *
     * @param certificate The certificate to be added.
     * @param certificateAddOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall addAsync(CertificateAddParameter certificate, CertificateAddOptions certificateAddOptions, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Lists all of the certificates that have been added to the specified account.
     *
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Certificate&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<PagedList<Certificate>, CertificateListHeaders> list() throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Lists all of the certificates that have been added to the specified account.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final ListOperationCallback<Certificate> serviceCallback) throws IllegalArgumentException;
    /**
     * Lists all of the certificates that have been added to the specified account.
     *
     * @param certificateListOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Certificate&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<PagedList<Certificate>, CertificateListHeaders> list(final CertificateListOptions certificateListOptions) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Lists all of the certificates that have been added to the specified account.
     *
     * @param certificateListOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final CertificateListOptions certificateListOptions, final ListOperationCallback<Certificate> serviceCallback) throws IllegalArgumentException;

    /**
     * Cancels a failed deletion of a certificate from the specified account.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate being deleted.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, CertificateCancelDeletionHeaders> cancelDeletion(String thumbprintAlgorithm, String thumbprint) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Cancels a failed deletion of a certificate from the specified account.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate being deleted.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall cancelDeletionAsync(String thumbprintAlgorithm, String thumbprint, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Cancels a failed deletion of a certificate from the specified account.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate being deleted.
     * @param certificateCancelDeletionOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, CertificateCancelDeletionHeaders> cancelDeletion(String thumbprintAlgorithm, String thumbprint, CertificateCancelDeletionOptions certificateCancelDeletionOptions) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Cancels a failed deletion of a certificate from the specified account.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate being deleted.
     * @param certificateCancelDeletionOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall cancelDeletionAsync(String thumbprintAlgorithm, String thumbprint, CertificateCancelDeletionOptions certificateCancelDeletionOptions, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes a certificate from the specified account.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate to be deleted.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, CertificateDeleteHeaders> delete(String thumbprintAlgorithm, String thumbprint) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Deletes a certificate from the specified account.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate to be deleted.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String thumbprintAlgorithm, String thumbprint, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Deletes a certificate from the specified account.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate to be deleted.
     * @param certificateDeleteOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, CertificateDeleteHeaders> delete(String thumbprintAlgorithm, String thumbprint, CertificateDeleteOptions certificateDeleteOptions) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Deletes a certificate from the specified account.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate to be deleted.
     * @param certificateDeleteOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String thumbprintAlgorithm, String thumbprint, CertificateDeleteOptions certificateDeleteOptions, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets information about the specified certificate.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate to get.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Certificate object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<Certificate, CertificateGetHeaders> get(String thumbprintAlgorithm, String thumbprint) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Gets information about the specified certificate.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate to get.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String thumbprintAlgorithm, String thumbprint, final ServiceCallback<Certificate> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets information about the specified certificate.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate to get.
     * @param certificateGetOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Certificate object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<Certificate, CertificateGetHeaders> get(String thumbprintAlgorithm, String thumbprint, CertificateGetOptions certificateGetOptions) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Gets information about the specified certificate.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the certificate to get.
     * @param certificateGetOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String thumbprintAlgorithm, String thumbprint, CertificateGetOptions certificateGetOptions, final ServiceCallback<Certificate> serviceCallback) throws IllegalArgumentException;

    /**
     * Lists all of the certificates that have been added to the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Certificate&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<PageImpl<Certificate>, CertificateListHeaders> listNext(final String nextPageLink) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Lists all of the certificates that have been added to the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<Certificate> serviceCallback) throws IllegalArgumentException;
    /**
     * Lists all of the certificates that have been added to the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param certificateListNextOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Certificate&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<PageImpl<Certificate>, CertificateListHeaders> listNext(final String nextPageLink, final CertificateListNextOptions certificateListNextOptions) throws BatchErrorException, IOException, IllegalArgumentException;

    /**
     * Lists all of the certificates that have been added to the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param certificateListNextOptions Additional parameters for the operation
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final CertificateListNextOptions certificateListNextOptions, final ServiceCall serviceCall, final ListOperationCallback<Certificate> serviceCallback) throws IllegalArgumentException;

}
