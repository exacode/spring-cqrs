package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDependReferenceIndex is a Querydsl query type for QPgDependReferenceIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDependReferenceIndex extends com.mysema.query.sql.RelationalPathBase<QPgDependReferenceIndex> {

    private static final long serialVersionUID = -1095255634;

    public static final QPgDependReferenceIndex pgDependReferenceIndex = new QPgDependReferenceIndex("pg_depend_reference_index");

    public final NumberPath<Long> refclassid = createNumber("refclassid", Long.class);

    public final NumberPath<Long> refobjid = createNumber("refobjid", Long.class);

    public final NumberPath<Integer> refobjsubid = createNumber("refobjsubid", Integer.class);

    public QPgDependReferenceIndex(String variable) {
        super(QPgDependReferenceIndex.class, forVariable(variable), "pg_catalog", "pg_depend_reference_index");
    }

    @SuppressWarnings("all")
    public QPgDependReferenceIndex(Path<? extends QPgDependReferenceIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_depend_reference_index");
    }

    public QPgDependReferenceIndex(PathMetadata<?> metadata) {
        super(QPgDependReferenceIndex.class, metadata, "pg_catalog", "pg_depend_reference_index");
    }

}

