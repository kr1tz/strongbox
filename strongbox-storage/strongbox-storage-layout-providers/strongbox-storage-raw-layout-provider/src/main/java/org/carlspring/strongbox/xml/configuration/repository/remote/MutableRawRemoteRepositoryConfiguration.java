package org.carlspring.strongbox.xml.configuration.repository.remote;

import org.carlspring.strongbox.xml.repository.remote.CustomRemoteRepositoryConfiguration;
import org.carlspring.strongbox.xml.repository.remote.MutableRemoteRepositoryConfiguration;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Pablo Tirado
 */
@JsonRootName("rawRemoteRepositoryConfiguration")
public class MutableRawRemoteRepositoryConfiguration extends MutableRemoteRepositoryConfiguration
{

    @Override
    public CustomRemoteRepositoryConfiguration getImmutable()
    {
        return new RawRemoteRepositoryConfiguration();
    }

}
