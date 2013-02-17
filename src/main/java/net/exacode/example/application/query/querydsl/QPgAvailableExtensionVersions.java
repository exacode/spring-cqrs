package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAvailableExtensionVersions is a Querydsl query type for QPgAvailableExtensionVersions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAvailableExtensionVersions extends com.mysema.query.sql.RelationalPathBase<QPgAvailableExtensionVersions> {

    private static final long serialVersionUID = -1956334644;

    public static final QPgAvailableExtensionVersions pgAvailableExtensionVersions = new QPgAvailableExtensionVersions("pg_available_extension_versions");

    public final StringPath comment = createString("comment");

    public final BooleanPath installed = createBoolean("installed");

    public final StringPath name = createString("name");

    public final BooleanPath relocatable = createBoolean("relocatable");

    public final SimplePath<Object[]> requires = createSimple("requires", Object[].class);

    public final StringPath schema = createString("schema");

    public final BooleanPath superuser = createBoolean("superuser");

    public final StringPath version = createString("version");

    public QPgAvailableExtensionVersions(String variable) {
        super(QPgAvailableExtensionVersions.class, forVariable(variable), "pg_catalog", "pg_available_extension_versions");
    }

    @SuppressWarnings("all")
    public QPgAvailableExtensionVersions(Path<? extends QPgAvailableExtensionVersions> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_available_extension_versions");
    }

    public QPgAvailableExtensionVersions(PathMetadata<?> metadata) {
        super(QPgAvailableExtensionVersions.class, metadata, "pg_catalog", "pg_available_extension_versions");
    }

}

