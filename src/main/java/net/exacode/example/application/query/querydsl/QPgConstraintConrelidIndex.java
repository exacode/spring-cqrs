package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgConstraintConrelidIndex is a Querydsl query type for QPgConstraintConrelidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgConstraintConrelidIndex extends com.mysema.query.sql.RelationalPathBase<QPgConstraintConrelidIndex> {

    private static final long serialVersionUID = 1761265704;

    public static final QPgConstraintConrelidIndex pgConstraintConrelidIndex = new QPgConstraintConrelidIndex("pg_constraint_conrelid_index");

    public final NumberPath<Long> conrelid = createNumber("conrelid", Long.class);

    public QPgConstraintConrelidIndex(String variable) {
        super(QPgConstraintConrelidIndex.class, forVariable(variable), "pg_catalog", "pg_constraint_conrelid_index");
    }

    @SuppressWarnings("all")
    public QPgConstraintConrelidIndex(Path<? extends QPgConstraintConrelidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_constraint_conrelid_index");
    }

    public QPgConstraintConrelidIndex(PathMetadata<?> metadata) {
        super(QPgConstraintConrelidIndex.class, metadata, "pg_catalog", "pg_constraint_conrelid_index");
    }

}

