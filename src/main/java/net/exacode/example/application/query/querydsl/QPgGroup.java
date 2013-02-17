package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgGroup is a Querydsl query type for QPgGroup
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgGroup extends com.mysema.query.sql.RelationalPathBase<QPgGroup> {

    private static final long serialVersionUID = 11708420;

    public static final QPgGroup pgGroup = new QPgGroup("pg_group");

    public final SimplePath<Object[]> grolist = createSimple("grolist", Object[].class);

    public final StringPath groname = createString("groname");

    public final NumberPath<Long> grosysid = createNumber("grosysid", Long.class);

    public QPgGroup(String variable) {
        super(QPgGroup.class, forVariable(variable), "pg_catalog", "pg_group");
    }

    @SuppressWarnings("all")
    public QPgGroup(Path<? extends QPgGroup> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_group");
    }

    public QPgGroup(PathMetadata<?> metadata) {
        super(QPgGroup.class, metadata, "pg_catalog", "pg_group");
    }

}

