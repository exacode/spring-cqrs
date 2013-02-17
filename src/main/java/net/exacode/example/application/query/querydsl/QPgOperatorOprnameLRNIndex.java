package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgOperatorOprnameLRNIndex is a Querydsl query type for QPgOperatorOprnameLRNIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgOperatorOprnameLRNIndex extends com.mysema.query.sql.RelationalPathBase<QPgOperatorOprnameLRNIndex> {

    private static final long serialVersionUID = -811442201;

    public static final QPgOperatorOprnameLRNIndex pgOperatorOprnameLRNIndex = new QPgOperatorOprnameLRNIndex("pg_operator_oprname_l_r_n_index");

    public final NumberPath<Long> oprleft = createNumber("oprleft", Long.class);

    public final SimplePath<Object> oprname = createSimple("oprname", Object.class);

    public final NumberPath<Long> oprnamespace = createNumber("oprnamespace", Long.class);

    public final NumberPath<Long> oprright = createNumber("oprright", Long.class);

    public QPgOperatorOprnameLRNIndex(String variable) {
        super(QPgOperatorOprnameLRNIndex.class, forVariable(variable), "pg_catalog", "pg_operator_oprname_l_r_n_index");
    }

    @SuppressWarnings("all")
    public QPgOperatorOprnameLRNIndex(Path<? extends QPgOperatorOprnameLRNIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_operator_oprname_l_r_n_index");
    }

    public QPgOperatorOprnameLRNIndex(PathMetadata<?> metadata) {
        super(QPgOperatorOprnameLRNIndex.class, metadata, "pg_catalog", "pg_operator_oprname_l_r_n_index");
    }

}

